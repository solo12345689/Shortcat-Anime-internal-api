.class Lq5/g$g;
.super Lq5/g$O;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq5/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "g"
.end annotation


# static fields
.field private static a:Lq5/g$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lq5/g$g;

    .line 2
    .line 3
    invoke-direct {v0}, Lq5/g$g;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lq5/g$g;->a:Lq5/g$g;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lq5/g$O;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static a()Lq5/g$g;
    .locals 1

    .line 1
    sget-object v0, Lq5/g$g;->a:Lq5/g$g;

    .line 2
    .line 3
    return-object v0
.end method
