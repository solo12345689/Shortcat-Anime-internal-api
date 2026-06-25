.class public final Lsg/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field private final a:Z

.field private final b:Ltg/h;

.field private final c:Ljava/util/zip/Inflater;

.field private final d:Ltg/u;


# direct methods
.method public constructor <init>(Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lsg/c;->a:Z

    .line 5
    .line 6
    new-instance p1, Ltg/h;

    .line 7
    .line 8
    invoke-direct {p1}, Ltg/h;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lsg/c;->b:Ltg/h;

    .line 12
    .line 13
    new-instance v0, Ljava/util/zip/Inflater;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-direct {v0, v1}, Ljava/util/zip/Inflater;-><init>(Z)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lsg/c;->c:Ljava/util/zip/Inflater;

    .line 20
    .line 21
    new-instance v1, Ltg/u;

    .line 22
    .line 23
    invoke-direct {v1, p1, v0}, Ltg/u;-><init>(Ltg/Z;Ljava/util/zip/Inflater;)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lsg/c;->d:Ltg/u;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final a(Ltg/h;)V
    .locals 5

    .line 1
    const-string v0, "buffer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lsg/c;->b:Ltg/h;

    .line 7
    .line 8
    invoke-virtual {v0}, Ltg/h;->size()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    const-wide/16 v2, 0x0

    .line 13
    .line 14
    cmp-long v0, v0, v2

    .line 15
    .line 16
    if-nez v0, :cond_2

    .line 17
    .line 18
    iget-boolean v0, p0, Lsg/c;->a:Z

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lsg/c;->c:Ljava/util/zip/Inflater;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->reset()V

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lsg/c;->b:Ltg/h;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Ltg/h;->O0(Ltg/Z;)J

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lsg/c;->b:Ltg/h;

    .line 33
    .line 34
    const v1, 0xffff

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ltg/h;->d2(I)Ltg/h;

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lsg/c;->c:Ljava/util/zip/Inflater;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->getBytesRead()J

    .line 43
    .line 44
    .line 45
    move-result-wide v0

    .line 46
    iget-object v2, p0, Lsg/c;->b:Ltg/h;

    .line 47
    .line 48
    invoke-virtual {v2}, Ltg/h;->size()J

    .line 49
    .line 50
    .line 51
    move-result-wide v2

    .line 52
    add-long/2addr v0, v2

    .line 53
    :cond_1
    iget-object v2, p0, Lsg/c;->d:Ltg/u;

    .line 54
    .line 55
    const-wide v3, 0x7fffffffffffffffL

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, p1, v3, v4}, Ltg/u;->a(Ltg/h;J)J

    .line 61
    .line 62
    .line 63
    iget-object v2, p0, Lsg/c;->c:Ljava/util/zip/Inflater;

    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/util/zip/Inflater;->getBytesRead()J

    .line 66
    .line 67
    .line 68
    move-result-wide v2

    .line 69
    cmp-long v2, v2, v0

    .line 70
    .line 71
    if-ltz v2, :cond_1

    .line 72
    .line 73
    return-void

    .line 74
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 75
    .line 76
    const-string v0, "Failed requirement."

    .line 77
    .line 78
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw p1
.end method

.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lsg/c;->d:Ltg/u;

    .line 2
    .line 3
    invoke-virtual {v0}, Ltg/u;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
