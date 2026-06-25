.class public final synthetic Lg0/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lg0/h;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Lg0/h;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg0/c;->a:Lg0/h;

    .line 5
    .line 6
    iput-object p2, p0, Lg0/c;->b:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lg0/c;->c:Ljava/lang/Object;

    .line 9
    .line 10
    iput p4, p0, Lg0/c;->d:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lg0/c;->a:Lg0/h;

    .line 2
    .line 3
    iget-object v1, p0, Lg0/c;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lg0/c;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iget v3, p0, Lg0/c;->d:I

    .line 8
    .line 9
    move-object v4, p1

    .line 10
    check-cast v4, LY/m;

    .line 11
    .line 12
    check-cast p2, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    invoke-static/range {v0 .. v5}, Lg0/h;->c(Lg0/h;Ljava/lang/Object;Ljava/lang/Object;ILY/m;I)LTd/L;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method
