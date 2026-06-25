.class final Lcom/google/android/gms/measurement/internal/Y4;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/measurement/internal/B6;

.field final synthetic b:Z

.field final synthetic c:Lcom/google/android/gms/measurement/internal/E;

.field final synthetic d:Landroid/os/Bundle;

.field final synthetic e:Lcom/google/android/gms/measurement/internal/w5;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/w5;ZLcom/google/android/gms/measurement/internal/B6;ZLcom/google/android/gms/measurement/internal/E;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/Y4;->a:Lcom/google/android/gms/measurement/internal/B6;

    .line 2
    .line 3
    iput-boolean p4, p0, Lcom/google/android/gms/measurement/internal/Y4;->b:Z

    .line 4
    .line 5
    iput-object p5, p0, Lcom/google/android/gms/measurement/internal/Y4;->c:Lcom/google/android/gms/measurement/internal/E;

    .line 6
    .line 7
    iput-object p6, p0, Lcom/google/android/gms/measurement/internal/Y4;->d:Landroid/os/Bundle;

    .line 8
    .line 9
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/Y4;->e:Lcom/google/android/gms/measurement/internal/w5;

    .line 13
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/Y4;->e:Lcom/google/android/gms/measurement/internal/w5;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/w5;->N()Lj9/d;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "Failed to send default event parameters to service"

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/A3;->a:Lcom/google/android/gms/measurement/internal/X2;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/X2;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q2;->o()Lcom/google/android/gms/measurement/internal/o2;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/o2;->a(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/A3;->a:Lcom/google/android/gms/measurement/internal/X2;

    .line 26
    .line 27
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/X2;->w()Lcom/google/android/gms/measurement/internal/m;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    sget-object v4, Lcom/google/android/gms/measurement/internal/d2;->c1:Lcom/google/android/gms/measurement/internal/c2;

    .line 32
    .line 33
    const/4 v5, 0x0

    .line 34
    invoke-virtual {v3, v5, v4}, Lcom/google/android/gms/measurement/internal/m;->H(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/c2;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/Y4;->a:Lcom/google/android/gms/measurement/internal/B6;

    .line 41
    .line 42
    invoke-static {v0}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/Y4;->e:Lcom/google/android/gms/measurement/internal/w5;

    .line 46
    .line 47
    iget-boolean v3, p0, Lcom/google/android/gms/measurement/internal/Y4;->b:Z

    .line 48
    .line 49
    if-eqz v3, :cond_1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/Y4;->c:Lcom/google/android/gms/measurement/internal/E;

    .line 53
    .line 54
    :goto_0
    invoke-virtual {v2, v1, v5, v0}, Lcom/google/android/gms/measurement/internal/w5;->b0(Lj9/d;LS8/a;Lcom/google/android/gms/measurement/internal/B6;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_2
    :try_start_0
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/Y4;->a:Lcom/google/android/gms/measurement/internal/B6;

    .line 59
    .line 60
    invoke-static {v3}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/Y4;->d:Landroid/os/Bundle;

    .line 64
    .line 65
    invoke-interface {v1, v4, v3}, Lj9/d;->P2(Landroid/os/Bundle;Lcom/google/android/gms/measurement/internal/B6;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/w5;->J()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :catch_0
    move-exception v0

    .line 73
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/Y4;->e:Lcom/google/android/gms/measurement/internal/w5;

    .line 74
    .line 75
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/A3;->a:Lcom/google/android/gms/measurement/internal/X2;

    .line 76
    .line 77
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/X2;->a()Lcom/google/android/gms/measurement/internal/q2;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/q2;->o()Lcom/google/android/gms/measurement/internal/o2;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/measurement/internal/o2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    return-void
.end method
