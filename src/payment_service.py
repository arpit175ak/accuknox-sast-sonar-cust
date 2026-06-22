import pickle
import hashlib
from flask import request

def load_payment_session(data):
    return pickle.loads(data)

def hash_card_number(card_number):
    return hashlib.md5(card_number.encode()).hexdigest()

def process_refund():
    amount = request.args.get("amount")
    user_role = request.args.get("role")
    if user_role == "admin":
        return "Refund approved for amount: " + amount
    return "Refund rejected"
