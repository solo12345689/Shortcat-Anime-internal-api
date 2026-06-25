.class public final Loe/d$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Loe/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Loe/d$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(III)Loe/d;
    .locals 1

    .line 1
    new-instance v0, Loe/d;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3}, Loe/d;-><init>(III)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
