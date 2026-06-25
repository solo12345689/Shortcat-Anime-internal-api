.class final Lp0/k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lp0/d;


# static fields
.field public static final a:Lp0/k;

.field private static final b:J

.field private static final c:Li1/t;

.field private static final d:Li1/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lp0/k;

    .line 2
    .line 3
    invoke-direct {v0}, Lp0/k;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lp0/k;->a:Lp0/k;

    .line 7
    .line 8
    sget-object v0, Lr0/l;->b:Lr0/l$a;

    .line 9
    .line 10
    invoke-virtual {v0}, Lr0/l$a;->a()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    sput-wide v0, Lp0/k;->b:J

    .line 15
    .line 16
    sget-object v0, Li1/t;->a:Li1/t;

    .line 17
    .line 18
    sput-object v0, Lp0/k;->c:Li1/t;

    .line 19
    .line 20
    const/high16 v0, 0x3f800000    # 1.0f

    .line 21
    .line 22
    invoke-static {v0, v0}, Li1/f;->a(FF)Li1/d;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sput-object v0, Lp0/k;->d:Li1/d;

    .line 27
    .line 28
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public f()J
    .locals 2

    .line 1
    sget-wide v0, Lp0/k;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getDensity()Li1/d;
    .locals 1

    .line 1
    sget-object v0, Lp0/k;->d:Li1/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public getLayoutDirection()Li1/t;
    .locals 1

    .line 1
    sget-object v0, Lp0/k;->c:Li1/t;

    .line 2
    .line 3
    return-object v0
.end method
