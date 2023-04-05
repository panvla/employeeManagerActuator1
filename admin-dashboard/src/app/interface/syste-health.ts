export interface SysteHealth {
  status: string;
  components: {
    db: {
      status: string;
      details: {
        database: string;
        validationQuery: string;
      };
    };
    diskSpace: {
      status: string;
      details: {
        total: number;
        free: number;
        threshold: number;
        exists: boolean;
      };
    };
    ping: {
      status: string;
    };
  };
}
