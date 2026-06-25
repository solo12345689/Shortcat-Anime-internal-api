.class final Lw/p0$a$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/p0$a;->a()Li0/L;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lw/p0$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lw/p0$a$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lw/p0$a$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lw/p0$a$a;->a:Lw/p0$a$a;

    .line 7
    .line 8
    return-void
.end method

.method constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final a(Lie/a;)V
    .locals 0

    .line 1
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lie/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lw/p0$a$a;->a(Lie/a;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LTd/L;->a:LTd/L;

    .line 7
    .line 8
    return-object p1
.end method
