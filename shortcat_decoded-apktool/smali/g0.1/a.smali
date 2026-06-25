.class public final Lg0/a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public b()B
    .locals 1

    .line 1
    invoke-virtual {p0}, Lg0/a;->intValue()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-byte v0, v0

    .line 6
    return v0
.end method

.method public final bridge byteValue()B
    .locals 1

    .line 1
    invoke-virtual {p0}, Lg0/a;->b()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge c()D
    .locals 2

    .line 1
    invoke-super {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->doubleValue()D

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public bridge d()F
    .locals 1

    .line 1
    invoke-super {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->floatValue()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final bridge doubleValue()D
    .locals 2

    .line 1
    invoke-virtual {p0}, Lg0/a;->c()D

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public bridge e()I
    .locals 1

    .line 1
    invoke-super {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->intValue()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge f()J
    .locals 2

    .line 1
    invoke-super {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->longValue()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public final bridge floatValue()F
    .locals 1

    .line 1
    invoke-virtual {p0}, Lg0/a;->d()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public g()S
    .locals 1

    .line 1
    invoke-virtual {p0}, Lg0/a;->intValue()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-short v0, v0

    .line 6
    return v0
.end method

.method public final bridge intValue()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lg0/a;->e()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final bridge longValue()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lg0/a;->f()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public final bridge shortValue()S
    .locals 1

    .line 1
    invoke-virtual {p0}, Lg0/a;->g()S

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method
