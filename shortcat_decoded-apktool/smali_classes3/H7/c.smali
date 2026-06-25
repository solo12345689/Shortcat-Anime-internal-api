.class public final LH7/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH7/c$a;
    }
.end annotation


# static fields
.field public static final c:LH7/c$a;


# instance fields
.field private final a:LH7/d;

.field private final b:LH7/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LH7/c$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LH7/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LH7/c;->c:LH7/c$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(LH7/d;LH7/d;)V
    .locals 1

    .line 1
    const-string v0, "x"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "y"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LH7/c;->a:LH7/d;

    .line 15
    .line 16
    iput-object p2, p0, LH7/c;->b:LH7/d;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()LH7/d;
    .locals 1

    .line 1
    iget-object v0, p0, LH7/c;->a:LH7/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()LH7/d;
    .locals 1

    .line 1
    iget-object v0, p0, LH7/c;->b:LH7/d;

    .line 2
    .line 3
    return-object v0
.end method
