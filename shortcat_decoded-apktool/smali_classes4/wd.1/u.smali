.class public abstract Lwd/u;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwd/u$a;,
        Lwd/u$b;,
        Lwd/u$c;
    }
.end annotation


# static fields
.field public static final b:Lwd/u$a;


# instance fields
.field private final a:Lwd/t;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lwd/u$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lwd/u$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lwd/u;->b:Lwd/u$a;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>(Lwd/t;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwd/u;->a:Lwd/t;

    return-void
.end method

.method public synthetic constructor <init>(Lwd/t;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lwd/u;-><init>(Lwd/t;)V

    return-void
.end method


# virtual methods
.method public final a()Lwd/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lwd/u;->a:Lwd/t;

    .line 2
    .line 3
    return-object v0
.end method
