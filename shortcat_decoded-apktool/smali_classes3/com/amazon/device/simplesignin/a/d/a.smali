.class public final Lcom/amazon/device/simplesignin/a/d/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/amazon/device/simplesignin/a/d/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/amazon/a/a;->c()Lcom/amazon/a/a/g/c;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lcom/amazon/a/a/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private static a()Z
    .locals 1

    .line 3
    invoke-static {}, Lcom/amazon/a/a;->c()Lcom/amazon/a/a/g/c;

    move-result-object v0

    invoke-interface {v0}, Lcom/amazon/a/a/g/c;->a()Z

    move-result v0

    return v0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/amazon/device/simplesignin/a/d/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/amazon/a/a;->c()Lcom/amazon/a/a/g/c;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lcom/amazon/a/a/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private static b()Z
    .locals 1

    .line 3
    invoke-static {}, Lcom/amazon/a/a;->c()Lcom/amazon/a/a/g/c;

    move-result-object v0

    invoke-interface {v0}, Lcom/amazon/a/a/g/c;->b()Z

    move-result v0

    return v0
.end method
