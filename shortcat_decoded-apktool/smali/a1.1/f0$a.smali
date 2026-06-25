.class public final La1/f0$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La1/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:La1/f0$a;

.field private static final b:La1/f0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La1/f0$a;

    .line 2
    .line 3
    invoke-direct {v0}, La1/f0$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La1/f0$a;->a:La1/f0$a;

    .line 7
    .line 8
    new-instance v0, La1/e0;

    .line 9
    .line 10
    invoke-direct {v0}, La1/e0;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, La1/f0$a;->b:La1/f0;

    .line 14
    .line 15
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

.method public static synthetic a(LU0/e;)La1/d0;
    .locals 0

    .line 1
    invoke-static {p0}, La1/f0$a;->b(LU0/e;)La1/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final b(LU0/e;)La1/d0;
    .locals 2

    .line 1
    new-instance v0, La1/d0;

    .line 2
    .line 3
    sget-object v1, La1/J;->a:La1/J$a;

    .line 4
    .line 5
    invoke-virtual {v1}, La1/J$a;->a()La1/J;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, p0, v1}, La1/d0;-><init>(LU0/e;La1/J;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method


# virtual methods
.method public final c()La1/f0;
    .locals 1

    .line 1
    sget-object v0, La1/f0$a;->b:La1/f0;

    .line 2
    .line 3
    return-object v0
.end method
