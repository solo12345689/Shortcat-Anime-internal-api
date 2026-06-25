.class abstract LZe/u$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZe/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# static fields
.field private static final a:Ljava/util/Iterator;

.field private static final b:Ljava/lang/Iterable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LZe/u$b$a;

    .line 2
    .line 3
    invoke-direct {v0}, LZe/u$b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LZe/u$b;->a:Ljava/util/Iterator;

    .line 7
    .line 8
    new-instance v0, LZe/u$b$b;

    .line 9
    .line 10
    invoke-direct {v0}, LZe/u$b$b;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, LZe/u$b;->b:Ljava/lang/Iterable;

    .line 14
    .line 15
    return-void
.end method

.method static synthetic a()Ljava/util/Iterator;
    .locals 1

    .line 1
    sget-object v0, LZe/u$b;->a:Ljava/util/Iterator;

    .line 2
    .line 3
    return-object v0
.end method

.method static b()Ljava/lang/Iterable;
    .locals 1

    .line 1
    sget-object v0, LZe/u$b;->b:Ljava/lang/Iterable;

    .line 2
    .line 3
    return-object v0
.end method
