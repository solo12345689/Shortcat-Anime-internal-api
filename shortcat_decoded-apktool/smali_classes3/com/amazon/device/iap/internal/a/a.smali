.class public Lcom/amazon/device/iap/internal/a/a;
.super Lcom/amazon/a/a/i/h;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final b:Ljava/lang/String; = "a"

.field private static final e:Ljava/lang/String; = "http://www.amazon.com/gp/mas/get-appstore/android/ref=mas_mx_mba_iap_dl"

.field private static final f:Ljava/lang/String; = "Amazon Appstore required"

.field private static final g:Ljava/lang/String; = "Amazon Appstore Update Required"

.field private static final j:J = 0x1e13380L


# instance fields
.field private h:Lcom/amazon/a/a/a/a;
    .annotation runtime Lcom/amazon/a/a/k/a;
    .end annotation
.end field

.field private final i:Lcom/amazon/a/a/i/c;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lcom/amazon/a/a/i/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/amazon/a/a/i/h;-><init>(Lcom/amazon/a/a/i/c;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/amazon/device/iap/internal/a/a;->i:Lcom/amazon/a/a/i/c;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method protected h()J
    .locals 2

    .line 1
    const-wide/32 v0, 0x1e13380

    .line 2
    .line 3
    .line 4
    return-wide v0
.end method

.method protected i()V
    .locals 4

    .line 1
    sget-object v0, Lcom/amazon/device/iap/internal/a/a;->b:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "doAction"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/amazon/device/iap/internal/a/a;->i:Lcom/amazon/a/a/i/c;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/amazon/a/a/i/c;->e()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "Amazon Appstore required"

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lcom/amazon/device/iap/internal/a/a;->i:Lcom/amazon/a/a/i/c;

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/amazon/a/a/i/c;->e()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v1, "Amazon Appstore Update Required"

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    return-void

    .line 38
    :cond_1
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/amazon/device/iap/internal/a/a;->h:Lcom/amazon/a/a/a/a;

    .line 39
    .line 40
    invoke-interface {v0}, Lcom/amazon/a/a/a/a;->b()Landroid/app/Activity;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    iget-object v0, p0, Lcom/amazon/device/iap/internal/a/a;->h:Lcom/amazon/a/a/a/a;

    .line 47
    .line 48
    invoke-interface {v0}, Lcom/amazon/a/a/a/a;->a()Landroid/app/Activity;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    goto :goto_1

    .line 53
    :catch_0
    move-exception v0

    .line 54
    goto :goto_2

    .line 55
    :cond_2
    :goto_1
    new-instance v1, Landroid/content/Intent;

    .line 56
    .line 57
    const-string v2, "android.intent.action.VIEW"

    .line 58
    .line 59
    const-string v3, "http://www.amazon.com/gp/mas/get-appstore/android/ref=mas_mx_mba_iap_dl"

    .line 60
    .line 61
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :goto_2
    sget-object v1, Lcom/amazon/device/iap/internal/a/a;->b:Ljava/lang/String;

    .line 73
    .line 74
    new-instance v2, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    const-string v3, "Exception in PurchaseItemCommandTask.OnSuccess: "

    .line 80
    .line 81
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-static {v1, v0}, Lcom/amazon/device/iap/internal/util/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/amazon/device/iap/internal/a/a;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
