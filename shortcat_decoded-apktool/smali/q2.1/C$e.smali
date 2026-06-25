.class public final Lq2/C$e;
.super Lq2/C$d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq2/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# static fields
.field public static final r:Lq2/C$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lq2/C$d$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lq2/C$d$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lq2/C$d$a;->h()Lq2/C$e;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lq2/C$e;->r:Lq2/C$e;

    .line 11
    .line 12
    return-void
.end method

.method private constructor <init>(Lq2/C$d$a;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lq2/C$d;-><init>(Lq2/C$d$a;Lq2/C$a;)V

    return-void
.end method

.method synthetic constructor <init>(Lq2/C$d$a;Lq2/C$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lq2/C$e;-><init>(Lq2/C$d$a;)V

    return-void
.end method
