.class LE3/B2$b;
.super LF3/e$b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE3/B2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic c:LE3/B2;


# direct methods
.method private constructor <init>(LE3/B2;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE3/B2$b;->c:LE3/B2;

    invoke-direct {p0}, LF3/e$b;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(LE3/B2;LE3/B2$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LE3/B2$b;-><init>(LE3/B2;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/B2$b;->c:LE3/B2;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/B2;->P1()LF3/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, LE3/B2$b;->c:LE3/B2;

    .line 10
    .line 11
    invoke-virtual {v0}, LF3/e;->c()LF3/n$j;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v1, v0}, LE3/B2;->q1(LE3/B2;LF3/n$j;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/B2$b;->c:LE3/B2;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/B2;->Q1()LE3/A;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LE3/A;->a()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public c()V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/B2$b;->c:LE3/B2;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/B2;->Q1()LE3/A;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LE3/A;->a()V

    .line 8
    .line 9
    .line 10
    return-void
.end method
