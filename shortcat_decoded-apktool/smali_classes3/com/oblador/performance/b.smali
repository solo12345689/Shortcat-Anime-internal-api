.class Lcom/oblador/performance/b;
.super Lcom/oblador/performance/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method protected constructor <init>(Ljava/lang/String;J)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/oblador/performance/b;-><init>(Ljava/lang/String;JZ)V

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;JZ)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move v4, p4

    .line 2
    invoke-direct/range {v0 .. v5}, Lcom/oblador/performance/b;-><init>(Ljava/lang/String;JZLandroid/os/Bundle;)V

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;JZLandroid/os/Bundle;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/oblador/performance/a;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/oblador/performance/a;->a:Ljava/lang/String;

    .line 5
    iput-wide p2, p0, Lcom/oblador/performance/a;->b:J

    .line 6
    iput-boolean p4, p0, Lcom/oblador/performance/a;->c:Z

    .line 7
    iput-object p5, p0, Lcom/oblador/performance/a;->d:Landroid/os/Bundle;

    return-void
.end method
