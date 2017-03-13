package com.action;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.ParseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojo.Message;
import com.service.MessageService;

@Controller
@RequestMapping("/message.do")
public class MessageAction {

	@Autowired
	private MessageService messageService;

	@Autowired
	private HttpServletRequest request;

	@RequestMapping(params = "p=sendMes")
	public String sendMes() throws IOException {
		Message message = new Message();
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("contact_name");
		String Email = request.getParameter("contact_email");
		String subject = request.getParameter("contact_subject");
		String content = request.getParameter("content");
		System.out.println("subject=" + subject);
		System.out.println("content=" + content);
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
		String d = sdf.format(date);
		Random random = new Random();
		int x = random.nextInt(10000);
		d = d + x + "";
		message.setMessageId(Integer.parseInt(d));
		message.setMessageName(name);
		message.setMesageMail(Email);
		message.setMessageTitle(subject);
		message.setMessageContent(content);
		messageService.add(message);
		sendMail(message);
		return "/jsp/contact.jsp";
	}

	private void sendMail(Message message) throws ParseException, IOException {
		final String url = "http://api.sendcloud.net/apiv2/mail/send";
		final String apiUser = "TanPeng_test_163VXp";
		final String apiKey = "p7d5zP0KyLC9DJDV";
		HttpClient httpclient = new DefaultHttpClient();
		HttpPost httPost = new HttpPost(url);

		String from = "service@sendcloud.im";
		String fromName = message.getMessageName();
		String subject = message.getMessageTitle();
		String content = message.getMessageContent();
		String email_add = message.getMesageMail();
		content = content+"<br/>对方邮箱是："+email_add;
		List params = new ArrayList();
		// 您需要登录SendCloud创建API_USER，使用API_USER和API_KEY才可以进行邮件的发送。
		params.add(new BasicNameValuePair("apiUser", apiUser));
		params.add(new BasicNameValuePair("apiKey", apiKey));
		params.add(new BasicNameValuePair("from", from));
		params.add(new BasicNameValuePair("fromName", fromName));
		params.add(new BasicNameValuePair("to", "613258200@qq.com"));
		params.add(new BasicNameValuePair("subject", subject));
		params.add(new BasicNameValuePair("html",content));

		httPost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
		// 请求
		HttpResponse response = httpclient.execute(httPost);
		// 处理响应
		if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) { // 正常返回
			// 读取xml文档
			String result = EntityUtils.toString(response.getEntity());
			System.out.println(result);
		} else {
			System.err.println("error");
		}
		httPost.releaseConnection();
	}
}
