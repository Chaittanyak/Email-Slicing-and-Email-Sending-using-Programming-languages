email = input("Enter your email id : ").strip()
#eg : nkc123@gmail.com

user_name = email[:email.index("@")]
#Slicing out the user name(i.e.,nkc123)

domain_name = email[email.index("@")+1:]
#Slicing the domain here(i.e., gmail.com)

message = "Your name is'{}' and your domain is '{}' ".format(user_name,domain_name)

print(message)
#Here it display's your message...