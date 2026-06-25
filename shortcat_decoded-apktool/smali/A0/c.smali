.class public final LA0/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LA0/b;


# instance fields
.field private final a:Lkotlin/jvm/functions/Function1;

.field private final b:LY/C0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method private constructor <init>(ILkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, LA0/c;->a:Lkotlin/jvm/functions/Function1;

    .line 4
    invoke-static {p1}, LA0/a;->c(I)LA0/a;

    move-result-object p1

    const/4 p2, 0x0

    const/4 v0, 0x2

    invoke-static {p1, p2, v0, p2}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    move-result-object p1

    iput-object p1, p0, LA0/c;->b:LY/C0;

    return-void
.end method

.method public synthetic constructor <init>(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LA0/c;-><init>(ILkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget-object v0, p0, LA0/c;->b:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LA0/a;

    .line 8
    .line 9
    invoke-virtual {v0}, LA0/a;->i()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public b(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LA0/c;->b:LY/C0;

    .line 2
    .line 3
    invoke-static {p1}, LA0/a;->c(I)LA0/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
