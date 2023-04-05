import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { SysteHealth } from '../interface/syste-health';
import { SystemCpu } from '../interface/system-cpu';

@Injectable({
  providedIn: 'root',
})
export class DashboardService {
  private readonly SERVER_URL = 'http://localhost:8080/actuator';

  constructor(private http: HttpClient) {}

  public getHttpTraces(): Observable<any> {
    return this.http.get<any>(`${this.SERVER_URL}/httptrace`);
  }

  public getSystemHealth(): Observable<SysteHealth> {
    return this.http.get<SysteHealth>(`${this.SERVER_URL}/health`);
  }

  public getSystemCpu(): Observable<SystemCpu> {
    return this.http.get<SystemCpu>(
      `${this.SERVER_URL}/metrics/system.cpu.count`
    );
  }

  public getProcessUptime(): Observable<any> {
    return this.http.get<any>(`${this.SERVER_URL}/metrics/process/uptime`);
  }
}
