.class public final synthetic LY/S;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:LY/T;

.field public final synthetic b:Lg0/k;

.field public final synthetic c:Lt/K;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(LY/T;Lg0/k;Lt/K;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY/S;->a:LY/T;

    .line 5
    .line 6
    iput-object p2, p0, LY/S;->b:Lg0/k;

    .line 7
    .line 8
    iput-object p3, p0, LY/S;->c:Lt/K;

    .line 9
    .line 10
    iput p4, p0, LY/S;->d:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, LY/S;->a:LY/T;

    .line 2
    .line 3
    iget-object v1, p0, LY/S;->b:Lg0/k;

    .line 4
    .line 5
    iget-object v2, p0, LY/S;->c:Lt/K;

    .line 6
    .line 7
    iget v3, p0, LY/S;->d:I

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3, p1}, LY/T;->w(LY/T;Lg0/k;Lt/K;ILjava/lang/Object;)LTd/L;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
