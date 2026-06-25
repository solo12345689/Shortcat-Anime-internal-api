.class LV9/b$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LV9/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/math/BigInteger;

.field private b:Ljava/math/BigInteger;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(LV9/b$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, LV9/b$b;-><init>()V

    return-void
.end method

.method static synthetic a(LV9/b$b;)Ljava/math/BigInteger;
    .locals 0

    .line 1
    iget-object p0, p0, LV9/b$b;->b:Ljava/math/BigInteger;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic b(LV9/b$b;Ljava/math/BigInteger;)Ljava/math/BigInteger;
    .locals 0

    .line 1
    iput-object p1, p0, LV9/b$b;->b:Ljava/math/BigInteger;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic c(LV9/b$b;)Ljava/math/BigInteger;
    .locals 0

    .line 1
    iget-object p0, p0, LV9/b$b;->a:Ljava/math/BigInteger;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic d(LV9/b$b;Ljava/math/BigInteger;)Ljava/math/BigInteger;
    .locals 0

    .line 1
    iput-object p1, p0, LV9/b$b;->a:Ljava/math/BigInteger;

    .line 2
    .line 3
    return-object p1
.end method
