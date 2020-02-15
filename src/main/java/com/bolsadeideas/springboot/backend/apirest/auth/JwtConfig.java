package com.bolsadeideas.springboot.backend.apirest.auth;

public class JwtConfig {
	public static final String LLAVE_SECRETA = "alguna.clave.secre.12345678";
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEowIBAAKCAQEAxYyHCP5kNj/lk4OSY23YZZHTl/0Yyj3v/Jz2akcPVlRyPnkE\r\n" + 
			"pNt9DtTyQQ5PZ0JrLwhUiglkOEQlxG/1b9AY7VFch3rmX4Jtb2DShdcY4VS/vN7Y\r\n" + 
			"eCz5GNC0Kojae031qbeRaVyFE8Akh2VnXQejqHHOo5z9tINTHTmYyJZFaoD8yMf4\r\n" + 
			"XujiMp5sjIpEH8YJf491HquazMwbkG3t0t7RufNdc4GX9gF+KaZoakQEUn1svM7U\r\n" + 
			"AokeasM0fAGOHMHa50fzU6KtfFbHgdW/VU1M+H5rIaBSwBogaQSd7Jxshg2WvsKb\r\n" + 
			"l/Y5IkdEdm8YcTnzP70VUa6dS3wwaViYMsZ0swIDAQABAoIBAAsQxxOa5FQhmiN8\r\n" + 
			"MDv/kCqIU5jk5XmWpJW62Ra06kgErO2Q69CsNsIY7YT1Xz9CeiyFQ+8DfailMJRj\r\n" + 
			"TRU5S9wnPY6dNMBO1wBxJPm4Rb2BeMgEl42Lv1xDfIQRbGORx1v9W1jShOXJUoJ/\r\n" + 
			"DJ4qamFqFpAVoCR3YrV1X3iE6lh/zdPNaIQQCS4Zqhf0Gyoia6zZV6YznDtBhJhF\r\n" + 
			"Cx/GmGZtffgFXTIIS9qpaq/3WBPdpaYsmsacTvDLGZCSXkNbre+ed8BQimHz4nwv\r\n" + 
			"yLyVKESIs7O104y5tEiWX6iN60oNwmZ9Jnpp/lAqV1HgrF0Fs3DNsNsqg9zSR8nv\r\n" + 
			"871PPbECgYEA+dIpgz8G/MKglJj4qM/pqKORFPRDbfnTYRpINPx8EtzQYf/ypLcl\r\n" + 
			"uAlkiZcJU3+DHrPxBrHfSYPDcsmP1vGWeIoa8eEkkEyvUbh7L65z+FyElbWQfoZI\r\n" + 
			"io/12QXwTDFM8ckwt11m5gKBZEEJcpJNZp4cyedpI2SZ7rmykDYoWVsCgYEAym9i\r\n" + 
			"iETfpdQ2dJrH/gqAsGi4HfLPNuAZceGiqTqvcVDn0ZL8a5Typ7lgzwnCrCMfk9pD\r\n" + 
			"5g5olxv+0zk/hGuKIncW36P8E/JWd2KvFhOk5k8POeHyuyb46mrCdgjxLPSDhjA/\r\n" + 
			"vr3FCk8T8i9md8vzj3SRUzxKJX+GgvGRIgy6WYkCgYBFDIOQ1SDXR+weZlGER0Mr\r\n" + 
			"61m0Uvc4NG7qTdtbWdXpWML380hboot4XJA/P1HClGHnYJDj6tHufc7NsUxieo++\r\n" + 
			"bV2ZMUNr5uYmTjkuKqe/I8M5pd90OSVftv6ap3uNc6rywUsHw3cnZ9XfoeI8mpdu\r\n" + 
			"H5GRdLaoo6uwQf9KwM1SNQKBgQC3eC4APRPJksTr96BMgS5TNAWytu7Q2FiXWx12\r\n" + 
			"bQa3F9GSorn9sxgdpSi1XC5AnvCuqwIgzmxCkA/rVhZYKLMgO3jSpif/2AI/34O5\r\n" + 
			"6YHpbjvphPveXRr6MloeakpTKSTPCImtkQa1Kih0tjsTVhhfqxFPM/QreiHqKZAV\r\n" + 
			"IR3/qQKBgCPhOnfZmJvNO4EpjfIn5/R+D2n2Udqw4WTwnAJwodHhMVGzDNi20sQV\r\n" + 
			"GUULhNubQHDnMs4hU/Ifyr8m5g68piAPEJHQXkryS6KiVHbUChMFv+NCLghY22N7\r\n" + 
			"xksgclZ3I9IBVRz5jY2hAQyka158HSB/tgm/G8db3O11SVPFr8at\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA  = "-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxYyHCP5kNj/lk4OSY23Y\r\n" + 
			"ZZHTl/0Yyj3v/Jz2akcPVlRyPnkEpNt9DtTyQQ5PZ0JrLwhUiglkOEQlxG/1b9AY\r\n" + 
			"7VFch3rmX4Jtb2DShdcY4VS/vN7YeCz5GNC0Kojae031qbeRaVyFE8Akh2VnXQej\r\n" + 
			"qHHOo5z9tINTHTmYyJZFaoD8yMf4XujiMp5sjIpEH8YJf491HquazMwbkG3t0t7R\r\n" + 
			"ufNdc4GX9gF+KaZoakQEUn1svM7UAokeasM0fAGOHMHa50fzU6KtfFbHgdW/VU1M\r\n" + 
			"+H5rIaBSwBogaQSd7Jxshg2WvsKbl/Y5IkdEdm8YcTnzP70VUa6dS3wwaViYMsZ0\r\n" + 
			"swIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";
}
