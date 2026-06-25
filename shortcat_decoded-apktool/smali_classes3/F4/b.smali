.class public final LF4/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF4/b$a;,
        LF4/b$b;
    }
.end annotation


# static fields
.field public static final c:LF4/b$a;


# instance fields
.field private final a:Ldg/C;

.field private final b:LF4/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LF4/b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LF4/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LF4/b;->c:LF4/b$a;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>(Ldg/C;LF4/a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LF4/b;->a:Ldg/C;

    .line 4
    iput-object p2, p0, LF4/b;->b:LF4/a;

    return-void
.end method

.method public synthetic constructor <init>(Ldg/C;LF4/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LF4/b;-><init>(Ldg/C;LF4/a;)V

    return-void
.end method


# virtual methods
.method public final a()LF4/a;
    .locals 1

    .line 1
    iget-object v0, p0, LF4/b;->b:LF4/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Ldg/C;
    .locals 1

    .line 1
    iget-object v0, p0, LF4/b;->a:Ldg/C;

    .line 2
    .line 3
    return-object v0
.end method
