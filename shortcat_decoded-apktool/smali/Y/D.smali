.class public abstract LY/D;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:LY/n2;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method private constructor <init>(Lie/a;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, LY/q0;

    invoke-direct {v0, p1}, LY/q0;-><init>(Lie/a;)V

    iput-object v0, p0, LY/D;->a:LY/n2;

    return-void
.end method

.method public synthetic constructor <init>(Lie/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LY/D;-><init>(Lie/a;)V

    return-void
.end method


# virtual methods
.method public a()LY/n2;
    .locals 1

    .line 1
    iget-object v0, p0, LY/D;->a:LY/n2;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract b(LY/c1;LY/n2;)LY/n2;
.end method
