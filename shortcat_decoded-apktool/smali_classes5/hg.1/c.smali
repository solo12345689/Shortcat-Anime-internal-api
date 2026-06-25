.class public final Lhg/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhg/c$a;,
        Lhg/c$b;
    }
.end annotation


# static fields
.field public static final c:Lhg/c$a;


# instance fields
.field private final a:Ldg/C;

.field private final b:Ldg/E;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lhg/c$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lhg/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lhg/c;->c:Lhg/c$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ldg/C;Ldg/E;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhg/c;->a:Ldg/C;

    .line 5
    .line 6
    iput-object p2, p0, Lhg/c;->b:Ldg/E;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Ldg/E;
    .locals 1

    .line 1
    iget-object v0, p0, Lhg/c;->b:Ldg/E;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Ldg/C;
    .locals 1

    .line 1
    iget-object v0, p0, Lhg/c;->a:Ldg/C;

    .line 2
    .line 3
    return-object v0
.end method
