.class public final Lrf/f$a;
.super Lrf/f;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrf/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lrf/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lrf/f$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lrf/f$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lrf/f$a;->a:Lrf/f$a;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lrf/f;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
