.class public final Lh6/b$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh6/b;
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
    invoke-direct {p0}, Lh6/b$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lh6/b$a;La6/a;)Lj6/b;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lh6/b$a;->b(La6/a;)Lj6/b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final b(La6/a;)Lj6/b;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    new-instance v0, Lj6/a;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Lj6/a;-><init>(La6/d;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method
