.class public final LD2/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LD2/f;


# instance fields
.field private final a:LU2/g;

.field private final b:J


# direct methods
.method public constructor <init>(LU2/g;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LD2/h;->a:LU2/g;

    .line 5
    .line 6
    iput-wide p2, p0, LD2/h;->b:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public d(J)J
    .locals 2

    .line 1
    iget-object v0, p0, LD2/h;->a:LU2/g;

    .line 2
    .line 3
    iget-object v0, v0, LU2/g;->e:[J

    .line 4
    .line 5
    long-to-int p1, p1

    .line 6
    aget-wide p1, v0, p1

    .line 7
    .line 8
    iget-wide v0, p0, LD2/h;->b:J

    .line 9
    .line 10
    sub-long/2addr p1, v0

    .line 11
    return-wide p1
.end method

.method public e(JJ)J
    .locals 0

    .line 1
    iget-object p3, p0, LD2/h;->a:LU2/g;

    .line 2
    .line 3
    iget-object p3, p3, LU2/g;->d:[J

    .line 4
    .line 5
    long-to-int p1, p1

    .line 6
    aget-wide p1, p3, p1

    .line 7
    .line 8
    return-wide p1
.end method

.method public f(JJ)J
    .locals 0

    .line 1
    const-wide/16 p1, 0x0

    .line 2
    .line 3
    return-wide p1
.end method

.method public g(JJ)J
    .locals 0

    .line 1
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    return-wide p1
.end method

.method public h(J)LE2/i;
    .locals 6

    .line 1
    new-instance v0, LE2/i;

    .line 2
    .line 3
    iget-object v1, p0, LD2/h;->a:LU2/g;

    .line 4
    .line 5
    iget-object v2, v1, LU2/g;->c:[J

    .line 6
    .line 7
    long-to-int p1, p1

    .line 8
    aget-wide v3, v2, p1

    .line 9
    .line 10
    iget-object p2, v1, LU2/g;->b:[I

    .line 11
    .line 12
    aget p1, p2, p1

    .line 13
    .line 14
    int-to-long p1, p1

    .line 15
    const/4 v1, 0x0

    .line 16
    move-wide v2, v3

    .line 17
    move-wide v4, p1

    .line 18
    invoke-direct/range {v0 .. v5}, LE2/i;-><init>(Ljava/lang/String;JJ)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public i(JJ)J
    .locals 2

    .line 1
    iget-object p3, p0, LD2/h;->a:LU2/g;

    .line 2
    .line 3
    iget-wide v0, p0, LD2/h;->b:J

    .line 4
    .line 5
    add-long/2addr p1, v0

    .line 6
    invoke-virtual {p3, p1, p2}, LU2/g;->a(J)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    int-to-long p1, p1

    .line 11
    return-wide p1
.end method

.method public j(J)J
    .locals 0

    .line 1
    iget-object p1, p0, LD2/h;->a:LU2/g;

    .line 2
    .line 3
    iget p1, p1, LU2/g;->a:I

    .line 4
    .line 5
    int-to-long p1, p1

    .line 6
    return-wide p1
.end method

.method public k()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public l()J
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    return-wide v0
.end method

.method public m(JJ)J
    .locals 0

    .line 1
    iget-object p1, p0, LD2/h;->a:LU2/g;

    .line 2
    .line 3
    iget p1, p1, LU2/g;->a:I

    .line 4
    .line 5
    int-to-long p1, p1

    .line 6
    return-wide p1
.end method
