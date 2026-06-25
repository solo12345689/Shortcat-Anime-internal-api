.class LS2/k$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LS2/L$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS2/k;->B1(JJLJ2/q;Ljava/nio/ByteBuffer;IIIJZZLq2/x;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LJ2/q;

.field final synthetic b:I

.field final synthetic c:J

.field final synthetic d:LS2/k;


# direct methods
.method constructor <init>(LS2/k;LJ2/q;IJ)V
    .locals 0

    .line 1
    iput-object p1, p0, LS2/k$b;->d:LS2/k;

    .line 2
    .line 3
    iput-object p2, p0, LS2/k$b;->a:LJ2/q;

    .line 4
    .line 5
    iput p3, p0, LS2/k$b;->b:I

    .line 6
    .line 7
    iput-wide p4, p0, LS2/k$b;->c:J

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 7

    .line 1
    iget-object v0, p0, LS2/k$b;->d:LS2/k;

    .line 2
    .line 3
    iget-object v1, p0, LS2/k$b;->a:LJ2/q;

    .line 4
    .line 5
    iget v2, p0, LS2/k$b;->b:I

    .line 6
    .line 7
    iget-wide v3, p0, LS2/k$b;->c:J

    .line 8
    .line 9
    move-wide v5, p1

    .line 10
    invoke-static/range {v0 .. v6}, LS2/k;->j2(LS2/k;LJ2/q;IJJ)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public b()V
    .locals 5

    .line 1
    iget-object v0, p0, LS2/k$b;->d:LS2/k;

    .line 2
    .line 3
    iget-object v1, p0, LS2/k$b;->a:LJ2/q;

    .line 4
    .line 5
    iget v2, p0, LS2/k$b;->b:I

    .line 6
    .line 7
    iget-wide v3, p0, LS2/k$b;->c:J

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2, v3, v4}, LS2/k;->j3(LJ2/q;IJ)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
