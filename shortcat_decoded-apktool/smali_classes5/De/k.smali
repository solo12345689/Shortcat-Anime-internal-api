.class public final LDe/k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LDe/k$a;
    }
.end annotation


# static fields
.field public static final c:LDe/k$a;


# instance fields
.field private final a:Lmf/n;

.field private final b:LDe/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LDe/k$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LDe/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LDe/k;->c:LDe/k$a;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>(Lmf/n;LDe/a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LDe/k;->a:Lmf/n;

    .line 4
    iput-object p2, p0, LDe/k;->b:LDe/a;

    return-void
.end method

.method public synthetic constructor <init>(Lmf/n;LDe/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LDe/k;-><init>(Lmf/n;LDe/a;)V

    return-void
.end method


# virtual methods
.method public final a()Lmf/n;
    .locals 1

    .line 1
    iget-object v0, p0, LDe/k;->a:Lmf/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Lye/H;
    .locals 1

    .line 1
    iget-object v0, p0, LDe/k;->a:Lmf/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Lmf/n;->q()Lye/H;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final c()LDe/a;
    .locals 1

    .line 1
    iget-object v0, p0, LDe/k;->b:LDe/a;

    .line 2
    .line 3
    return-object v0
.end method
