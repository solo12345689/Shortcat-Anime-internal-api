.class public final Lg9/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field private static final a:Lg9/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lg9/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Lg9/b;-><init>(ZLg9/d;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lg9/b;->a:Lg9/b;

    .line 9
    .line 10
    return-void
.end method

.method private constructor <init>(ZLg9/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a(ZLg9/c;)Lg9/b;
    .locals 0

    .line 1
    sget-object p0, Lg9/b;->a:Lg9/b;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    return-void
.end method
