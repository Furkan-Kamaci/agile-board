import 'package:board_ui/feature/issue/domain/entity/issue.dart';
import 'package:http/http.dart' as http;

class IssueApi {
  static Future<http.Response> getTest() async {
    String localhost = "http://localhost:8080";
    // String localhost = "https://36f1-176-217-204-102.eu.ngrok.io";
    Uri uri = Uri.parse(localhost + "/api/issue/test");
    // Uri uri = Uri.parse("http://www.mocky.io/v2/5dca69523300004e003decc5");

    Uri uri2 = Uri.parse(localhost + "/api/issue/findAll");
    http.Response response2 = await http.get(uri2);
    print("findAll response: " + response2.body.toString());

    http.Response response = await http.get(uri);
    print("gelenler : " + response.body);
    return response;
  }

  // // static Future<http.Response> getDiziler() async {
  // static Future<List<Issue>> getDiziler() async {
  //   Uri uri = Uri.parse("http://localhost:8080/api/issue/findAll");
  //   // Uri uri = Uri.parse("http://www.mocky.io/v2/5dca69523300004e003decc5");

  //   http.Response response = await http.get(uri);
  //   // print("gelenler : " + response.body);
  //   // return response;

  //   List listJson = JsonHelper.convertResponseToList(response.body);
  //   List<DiziModel> diziList = [];
  //   for (var i = 0; i < listJson.length; i++) {
  //     diziList.add(DiziModel.fromJson(listJson[i]));
  //   }

  //   return diziList;
  // }
}
