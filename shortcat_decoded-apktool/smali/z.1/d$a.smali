.class public final Lz/d$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lz/d$a;

.field private static final b:Lw/i;

.field private static final c:Lz/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lz/d$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lz/d$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lz/d$a;->a:Lz/d$a;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    const/4 v1, 0x7

    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-static {v2, v2, v0, v1, v0}, Lw/j;->h(FFLjava/lang/Object;ILjava/lang/Object;)Lw/h0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lz/d$a;->b:Lw/i;

    .line 16
    .line 17
    new-instance v0, Lz/d$a$a;

    .line 18
    .line 19
    invoke-direct {v0}, Lz/d$a$a;-><init>()V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lz/d$a;->c:Lz/d;

    .line 23
    .line 24
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
.method public final a(FFF)F
    .locals 2

    .line 1
    add-float/2addr p2, p1

    .line 2
    const/4 v0, 0x0

    .line 3
    cmpl-float v1, p1, v0

    .line 4
    .line 5
    if-ltz v1, :cond_0

    .line 6
    .line 7
    cmpg-float v1, p2, p3

    .line 8
    .line 9
    if-gtz v1, :cond_0

    .line 10
    .line 11
    return v0

    .line 12
    :cond_0
    cmpg-float v1, p1, v0

    .line 13
    .line 14
    if-gez v1, :cond_1

    .line 15
    .line 16
    cmpl-float v1, p2, p3

    .line 17
    .line 18
    if-lez v1, :cond_1

    .line 19
    .line 20
    return v0

    .line 21
    :cond_1
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    sub-float/2addr p2, p3

    .line 26
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 27
    .line 28
    .line 29
    move-result p3

    .line 30
    cmpg-float p3, v0, p3

    .line 31
    .line 32
    if-gez p3, :cond_2

    .line 33
    .line 34
    return p1

    .line 35
    :cond_2
    return p2
.end method

.method public final b()Lz/d;
    .locals 1

    .line 1
    sget-object v0, Lz/d$a;->c:Lz/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Lw/i;
    .locals 1

    .line 1
    sget-object v0, Lz/d$a;->b:Lw/i;

    .line 2
    .line 3
    return-object v0
.end method
