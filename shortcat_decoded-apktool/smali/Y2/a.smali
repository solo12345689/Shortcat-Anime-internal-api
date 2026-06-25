.class public final LY2/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LU2/p;


# instance fields
.field private final a:LU2/L;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LU2/L;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    const-string v2, "image/bmp"

    .line 8
    .line 9
    const/16 v3, 0x424d

    .line 10
    .line 11
    invoke-direct {v0, v3, v1, v2}, LU2/L;-><init>(IILjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, LY2/a;->a:LU2/L;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 1
    return-void
.end method

.method public b(JJ)V
    .locals 1

    .line 1
    iget-object v0, p0, LY2/a;->a:LU2/L;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, LU2/L;->b(JJ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c(LU2/r;)V
    .locals 1

    .line 1
    iget-object v0, p0, LY2/a;->a:LU2/L;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LU2/L;->c(LU2/r;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public f(LU2/q;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LY2/a;->a:LU2/L;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LU2/L;->f(LU2/q;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public h(LU2/q;LU2/I;)I
    .locals 1

    .line 1
    iget-object v0, p0, LY2/a;->a:LU2/L;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LU2/L;->h(LU2/q;LU2/I;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
