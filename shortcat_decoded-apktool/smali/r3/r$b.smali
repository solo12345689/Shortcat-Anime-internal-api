.class public Lr3/r$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr3/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field private static final c:Lr3/r$b;


# instance fields
.field public final a:J

.field public final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lr3/r$b;

    .line 2
    .line 3
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-direct {v0, v1, v2, v3}, Lr3/r$b;-><init>(JZ)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lr3/r$b;->c:Lr3/r$b;

    .line 13
    .line 14
    return-void
.end method

.method private constructor <init>(JZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lr3/r$b;->a:J

    .line 5
    .line 6
    iput-boolean p3, p0, Lr3/r$b;->b:Z

    .line 7
    .line 8
    return-void
.end method

.method static synthetic a()Lr3/r$b;
    .locals 1

    .line 1
    sget-object v0, Lr3/r$b;->c:Lr3/r$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public static b()Lr3/r$b;
    .locals 1

    .line 1
    sget-object v0, Lr3/r$b;->c:Lr3/r$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public static c(J)Lr3/r$b;
    .locals 2

    .line 1
    new-instance v0, Lr3/r$b;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, p1, v1}, Lr3/r$b;-><init>(JZ)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
