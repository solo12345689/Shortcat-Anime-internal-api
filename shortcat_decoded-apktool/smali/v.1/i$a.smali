.class final Lv/i$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lv/i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lv/i$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lv/i$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lv/i$a;->a:Lv/i$a;

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
.method public final a(Lt0/c;)Lw/s0;
    .locals 2

    .line 1
    sget-object v0, Lv/i$a$a;->a:Lv/i$a$a;

    .line 2
    .line 3
    new-instance v1, Lv/i$a$b;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Lv/i$a$b;-><init>(Lt0/c;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lw/u0;->a(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lw/s0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lt0/c;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lv/i$a;->a(Lt0/c;)Lw/s0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
