.class public final Llb/a$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/android/installreferrer/api/InstallReferrerStateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llb/a;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/J;

.field final synthetic b:Lcom/android/installreferrer/api/InstallReferrerClient;

.field final synthetic c:Ljava/lang/StringBuilder;

.field final synthetic d:LUb/u;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/J;Lcom/android/installreferrer/api/InstallReferrerClient;Ljava/lang/StringBuilder;LUb/u;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llb/a$a;->a:Lkotlin/jvm/internal/J;

    .line 2
    .line 3
    iput-object p2, p0, Llb/a$a;->b:Lcom/android/installreferrer/api/InstallReferrerClient;

    .line 4
    .line 5
    iput-object p3, p0, Llb/a$a;->c:Ljava/lang/StringBuilder;

    .line 6
    .line 7
    iput-object p4, p0, Llb/a$a;->d:LUb/u;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public onInstallReferrerServiceDisconnected()V
    .locals 4

    .line 1
    iget-object v0, p0, Llb/a$a;->a:Lkotlin/jvm/internal/J;

    .line 2
    .line 3
    iget-boolean v1, v0, Lkotlin/jvm/internal/J;->a:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v1, 0x1

    .line 9
    iput-boolean v1, v0, Lkotlin/jvm/internal/J;->a:Z

    .line 10
    .line 11
    iget-object v0, p0, Llb/a$a;->d:LUb/u;

    .line 12
    .line 13
    const-string v1, "Connection to install referrer service was lost."

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const-string v3, "ERR_APPLICATION_INSTALL_REFERRER_SERVICE_DISCONNECTED"

    .line 17
    .line 18
    invoke-interface {v0, v3, v1, v2}, LUb/u;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public onInstallReferrerSetupFinished(I)V
    .locals 6

    .line 1
    iget-object v0, p0, Llb/a$a;->a:Lkotlin/jvm/internal/J;

    .line 2
    .line 3
    iget-boolean v1, v0, Lkotlin/jvm/internal/J;->a:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v1, 0x1

    .line 9
    if-eqz p1, :cond_3

    .line 10
    .line 11
    const-string v2, "General error retrieving the install referrer: response code "

    .line 12
    .line 13
    const-string v3, "ERR_APPLICATION_INSTALL_REFERRER"

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    if-eq p1, v1, :cond_2

    .line 17
    .line 18
    const/4 v5, 0x2

    .line 19
    if-eq p1, v5, :cond_1

    .line 20
    .line 21
    iput-boolean v1, v0, Lkotlin/jvm/internal/J;->a:Z

    .line 22
    .line 23
    iget-object v0, p0, Llb/a$a;->d:LUb/u;

    .line 24
    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-interface {v0, v3, p1, v4}, LUb/u;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    iput-boolean v1, v0, Lkotlin/jvm/internal/J;->a:Z

    .line 45
    .line 46
    iget-object p1, p0, Llb/a$a;->d:LUb/u;

    .line 47
    .line 48
    const-string v0, "ERR_APPLICATION_INSTALL_REFERRER_UNAVAILABLE"

    .line 49
    .line 50
    const-string v1, "The current Play Store app doesn\'t provide the installation referrer API, or the Play Store may not be installed."

    .line 51
    .line 52
    invoke-interface {p1, v0, v1, v4}, LUb/u;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    iput-boolean v1, v0, Lkotlin/jvm/internal/J;->a:Z

    .line 57
    .line 58
    iget-object v0, p0, Llb/a$a;->d:LUb/u;

    .line 59
    .line 60
    new-instance v1, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-interface {v0, v3, p1, v4}, LUb/u;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    :try_start_0
    iget-object p1, p0, Llb/a$a;->b:Lcom/android/installreferrer/api/InstallReferrerClient;

    .line 80
    .line 81
    invoke-virtual {p1}, Lcom/android/installreferrer/api/InstallReferrerClient;->getInstallReferrer()Lcom/android/installreferrer/api/ReferrerDetails;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iget-object v0, p0, Llb/a$a;->c:Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-virtual {p1}, Lcom/android/installreferrer/api/ReferrerDetails;->getInstallReferrer()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    .line 93
    .line 94
    iget-object p1, p0, Llb/a$a;->a:Lkotlin/jvm/internal/J;

    .line 95
    .line 96
    iput-boolean v1, p1, Lkotlin/jvm/internal/J;->a:Z

    .line 97
    .line 98
    iget-object p1, p0, Llb/a$a;->d:LUb/u;

    .line 99
    .line 100
    iget-object v0, p0, Llb/a$a;->c:Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    const-string v1, "toString(...)"

    .line 107
    .line 108
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-interface {p1, v0}, LUb/u;->resolve(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    :goto_0
    iget-object p1, p0, Llb/a$a;->b:Lcom/android/installreferrer/api/InstallReferrerClient;

    .line 115
    .line 116
    invoke-virtual {p1}, Lcom/android/installreferrer/api/InstallReferrerClient;->endConnection()V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :catchall_0
    move-exception p1

    .line 121
    goto :goto_1

    .line 122
    :catch_0
    move-exception p1

    .line 123
    :try_start_1
    iget-object v0, p0, Llb/a$a;->d:LUb/u;

    .line 124
    .line 125
    const-string v2, "ERR_APPLICATION_INSTALL_REFERRER_REMOTE_EXCEPTION"

    .line 126
    .line 127
    const-string v3, "RemoteException getting install referrer information. This may happen if the process hosting the remote object is no longer available."

    .line 128
    .line 129
    invoke-interface {v0, v2, v3, p1}, LUb/u;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 130
    .line 131
    .line 132
    iget-object p1, p0, Llb/a$a;->a:Lkotlin/jvm/internal/J;

    .line 133
    .line 134
    iput-boolean v1, p1, Lkotlin/jvm/internal/J;->a:Z

    .line 135
    .line 136
    return-void

    .line 137
    :goto_1
    iget-object v0, p0, Llb/a$a;->a:Lkotlin/jvm/internal/J;

    .line 138
    .line 139
    iput-boolean v1, v0, Lkotlin/jvm/internal/J;->a:Z

    .line 140
    .line 141
    throw p1
.end method
