import argparse

def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("-l", "--lab", dest = "labindex", nargs='?', default = "", choices = ('perf-2', 'perf-3', 'perf-4', 'perf-5', 'perf-6', 'perf-7', 'perf-8'))
    parser.add_argument("-t", "--task", dest = "task", default = "none", nargs='?', choices = ('create_tenant', 'all', 'deployment','none'))
    parser.add_argument("-ti", "--tenantid",dest ="tenantId", nargs='?')
    parser.add_argument("-f", "--features", dest = "features", default = [], nargs='+', choices = ('voice', 'email', 'chat','messaging'))
    args = parser.parse_args()
    print('Lab: %s\nTask: %s\nTenant Id: %s\nFeatures: %s'%(args.labindex, args.task, args.tenantId, args.features))


if __name__ == "__main__":
    main()