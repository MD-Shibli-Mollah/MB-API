
# AcBalResponseBodyInner

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | Identifier of the account. Often referred to as the account number, yet for consistency this is always referred to as accountId. Accepts both IBAN &amp; BBAN |  [optional]
**accountIBAN** | **String** | Represents the International Bank Account Number (IBAN) of the account.  E.g. GB29 NWBK 6016 1331 9268 19 |  [optional]
**currency** | **String** | Identifies the currency. E.g. USD, GBP etc |  [optional]
**availableBalance** | [**BigDecimal**](BigDecimal.md) | Available balance of the account which is the projected balance which includes the net movements of both debits and credits against the account. |  [optional]



