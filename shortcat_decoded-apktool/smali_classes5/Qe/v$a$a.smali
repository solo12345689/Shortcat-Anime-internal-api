.class public final LQe/v$a$a;
.super LQe/v$a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQe/v$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:LQe/x;

.field private final b:[B


# direct methods
.method public constructor <init>(LQe/x;[B)V
    .locals 1

    const-string v0, "kotlinJvmBinaryClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, LQe/v$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, LQe/v$a$a;->a:LQe/x;

    iput-object p2, p0, LQe/v$a$a;->b:[B

    return-void
.end method

.method public synthetic constructor <init>(LQe/x;[BILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2}, LQe/v$a$a;-><init>(LQe/x;[B)V

    return-void
.end method


# virtual methods
.method public final b()LQe/x;
    .locals 1

    .line 1
    iget-object v0, p0, LQe/v$a$a;->a:LQe/x;

    .line 2
    .line 3
    return-object v0
.end method
