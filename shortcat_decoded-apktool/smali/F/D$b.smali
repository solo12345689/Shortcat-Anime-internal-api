.class public final LF/D$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
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
    invoke-direct {p0}, LF/D$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lh0/p;)Lh0/v;
    .locals 2

    .line 1
    sget-object v0, LF/D$b$a;->a:LF/D$b$a;

    .line 2
    .line 3
    new-instance v1, LF/D$b$b;

    .line 4
    .line 5
    invoke-direct {v1, p1}, LF/D$b$b;-><init>(Lh0/p;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lh0/y;->e(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Lh0/v;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method
