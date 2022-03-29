import 'package:a_digital_payments_platform/preapproval_payment_page.dart';
import 'package:a_digital_payments_platform/recurring_payment_page.dart';
import 'package:flutter/material.dart';

import 'app_theme.dart';
import 'custom_widgets.dart';
import 'one_time_payment_page.dart';


class HomePage extends StatefulWidget {
  const HomePage({Key? key, required this.title}) : super(key: key);

  final String title;

  @override
  _HomePageState createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Center(child: Text(widget.title)),
      ),
      body: Column(
        children: [
          Container(
            width: MediaQuery.of(context).size.width,
            height: MediaQuery.of(context).size.width * 0.28,
            decoration: BoxDecoration(
              borderRadius: const BorderRadius.only(
                bottomLeft: Radius.circular(80.0),
                bottomRight: Radius.circular(80.0),
              ),
              color: AppThemeData().appColor,
            ),
            child: Column(
              mainAxisAlignment: MainAxisAlignment.start,
              children: [
                Image.asset(
                  'assets/images/logo_rounded.png',
                  height: 100.0,
                  width: 100.0,
                ),
              ],
            ),
          ),
          const SizedBox(
            height: 10.0,
          ),
          CustomWidgets().paymentInstruction(),
          const SizedBox(
            height: 20.0,
          ),
          CustomWidgets().paymentOptionButton(
              context, const OneTimePaymentPage(), "One Time Payment"),
          const SizedBox(
            height: 20.0,
          ),
          CustomWidgets().paymentOptionButton(
              context, const RecurringPaymentPage(), "Recurring Payment"),
          const SizedBox(
            height: 20.0,
          ),
          CustomWidgets().paymentOptionButton(
              context, const PreapprovalPaymentPage(), "Preapproval Payment"),
        ],
      ),
    );
  }
}
