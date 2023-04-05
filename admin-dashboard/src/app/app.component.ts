import { Component } from '@angular/core';
import { SysteHealth } from './interface/syste-health';
import { SystemCpu } from './interface/system-cpu';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  public traceList: any[] = [];
  public selectedTrace: any;
  public systemHealth: SysteHealth;
  public systemCpu: SystemCpu;
  public processUptime: string;
  public http200Traces: any[] = [];
  public http400Traces: any[] = [];
  public http404Traces: any[] = [];
  public http500Traces: any[] = [];
  public httpDefaultTraces: any[] = [];

  private getTraces(): void {}
}
