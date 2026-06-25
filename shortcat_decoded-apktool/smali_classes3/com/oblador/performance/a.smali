.class abstract Lcom/oblador/performance/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field protected a:Ljava/lang/String;

.field protected b:J

.field protected c:Z

.field protected d:Landroid/os/Bundle;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/oblador/performance/a;->c:Z

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lcom/oblador/performance/a;->d:Landroid/os/Bundle;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method protected a()Landroid/os/Bundle;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/oblador/performance/a;->d:Landroid/os/Bundle;

    .line 2
    .line 3
    return-object v0
.end method

.method protected b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/oblador/performance/a;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method protected c()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/oblador/performance/a;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method protected d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/oblador/performance/a;->c:Z

    .line 2
    .line 3
    return v0
.end method
