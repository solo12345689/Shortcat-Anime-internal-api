.class abstract Lz8/i$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz8/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:Lz8/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lz8/i;

    .line 2
    .line 3
    invoke-direct {v0}, Lz8/i;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lz8/i$a;->a:Lz8/i;

    .line 7
    .line 8
    return-void
.end method

.method static synthetic a()Lz8/i;
    .locals 1

    .line 1
    sget-object v0, Lz8/i$a;->a:Lz8/i;

    .line 2
    .line 3
    return-object v0
.end method
