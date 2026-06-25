.class public final LF/K;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lt/M;

.field private final b:Lt/M;

.field private c:J

.field private d:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lt/Y;->a()Lt/M;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, LF/K;->a:Lt/M;

    .line 9
    .line 10
    invoke-static {}, Lt/Y;->a()Lt/M;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, LF/K;->b:Lt/M;

    .line 15
    .line 16
    return-void
.end method

.method public static final synthetic a(LF/K;JJ)J
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, LF/K;->d(JJ)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static final synthetic b(LF/K;J)V
    .locals 0

    .line 1
    iput-wide p1, p0, LF/K;->c:J

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic c(LF/K;J)V
    .locals 0

    .line 1
    iput-wide p1, p0, LF/K;->d:J

    .line 2
    .line 3
    return-void
.end method

.method private final d(JJ)J
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p3, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-wide p1

    .line 8
    :cond_0
    const/4 v0, 0x4

    .line 9
    int-to-long v0, v0

    .line 10
    div-long/2addr p3, v0

    .line 11
    const/4 v2, 0x3

    .line 12
    int-to-long v2, v2

    .line 13
    mul-long/2addr p3, v2

    .line 14
    div-long/2addr p1, v0

    .line 15
    add-long/2addr p3, p1

    .line 16
    return-wide p3
.end method


# virtual methods
.method public final e()J
    .locals 2

    .line 1
    iget-wide v0, p0, LF/K;->c:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final f()Lt/M;
    .locals 1

    .line 1
    iget-object v0, p0, LF/K;->a:Lt/M;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()J
    .locals 2

    .line 1
    iget-wide v0, p0, LF/K;->d:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final h()Lt/M;
    .locals 1

    .line 1
    iget-object v0, p0, LF/K;->b:Lt/M;

    .line 2
    .line 3
    return-object v0
.end method
