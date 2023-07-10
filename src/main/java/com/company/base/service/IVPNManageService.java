package com.company.base.service;

import java.io.IOException;

public interface IVPNManageService {
	void connect() throws IOException, InterruptedException;

	void disconnect();
}
