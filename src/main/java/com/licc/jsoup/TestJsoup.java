package com.licc.jsoup;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * Function:(这里用一句话描述这个类的作用)
 *
 * @author Administrator
 * @version 1.0.0
 * @date 2017/7/6 16:13
 * @see
 */
public class TestJsoup {
  public static void main(String arge[]) throws IOException {
    Document doc = Jsoup.connect("https://www.wsy.com/item.htm?id=4302038").get();
    System.out.println(doc.outerHtml());
  }
}
