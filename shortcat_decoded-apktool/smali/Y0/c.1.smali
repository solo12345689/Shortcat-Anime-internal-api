.class public abstract LY0/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY0/t;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY0/c$a;
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:LY0/c$a;

.field private final c:LY0/K$d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method private constructor <init>(ILY0/c$a;LY0/K$d;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, LY0/c;->a:I

    .line 4
    iput-object p2, p0, LY0/c;->b:LY0/c$a;

    .line 5
    iput-object p3, p0, LY0/c;->c:LY0/K$d;

    return-void
.end method

.method public synthetic constructor <init>(ILY0/c$a;LY0/K$d;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, LY0/c;-><init>(ILY0/c$a;LY0/K$d;)V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, LY0/c;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public final d()LY0/c$a;
    .locals 1

    .line 1
    iget-object v0, p0, LY0/c;->b:LY0/c$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()LY0/K$d;
    .locals 1

    .line 1
    iget-object v0, p0, LY0/c;->c:LY0/K$d;

    .line 2
    .line 3
    return-object v0
.end method
