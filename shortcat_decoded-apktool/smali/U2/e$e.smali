.class public final LU2/e$e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU2/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# static fields
.field public static final d:LU2/e$e;


# instance fields
.field private final a:I

.field private final b:J

.field private final c:J


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, LU2/e$e;

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const-wide/16 v4, -0x1

    .line 9
    .line 10
    const/4 v1, -0x3

    .line 11
    invoke-direct/range {v0 .. v5}, LU2/e$e;-><init>(IJJ)V

    .line 12
    .line 13
    .line 14
    sput-object v0, LU2/e$e;->d:LU2/e$e;

    .line 15
    .line 16
    return-void
.end method

.method private constructor <init>(IJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LU2/e$e;->a:I

    .line 5
    .line 6
    iput-wide p2, p0, LU2/e$e;->b:J

    .line 7
    .line 8
    iput-wide p4, p0, LU2/e$e;->c:J

    .line 9
    .line 10
    return-void
.end method

.method static synthetic a(LU2/e$e;)I
    .locals 0

    .line 1
    iget p0, p0, LU2/e$e;->a:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic b(LU2/e$e;)J
    .locals 2

    .line 1
    iget-wide v0, p0, LU2/e$e;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method static synthetic c(LU2/e$e;)J
    .locals 2

    .line 1
    iget-wide v0, p0, LU2/e$e;->c:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static d(JJ)LU2/e$e;
    .locals 6

    .line 1
    new-instance v0, LU2/e$e;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    move-wide v2, p0

    .line 5
    move-wide v4, p2

    .line 6
    invoke-direct/range {v0 .. v5}, LU2/e$e;-><init>(IJJ)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static e(J)LU2/e$e;
    .locals 6

    .line 1
    new-instance v0, LU2/e$e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    move-wide v4, p0

    .line 10
    invoke-direct/range {v0 .. v5}, LU2/e$e;-><init>(IJJ)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public static f(JJ)LU2/e$e;
    .locals 6

    .line 1
    new-instance v0, LU2/e$e;

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    move-wide v2, p0

    .line 5
    move-wide v4, p2

    .line 6
    invoke-direct/range {v0 .. v5}, LU2/e$e;-><init>(IJJ)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method
