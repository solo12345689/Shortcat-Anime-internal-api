.class public final synthetic Le1/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# instance fields
.field public final synthetic a:Landroid/text/Spannable;

.field public final synthetic b:Lie/p;


# direct methods
.method public synthetic constructor <init>(Landroid/text/Spannable;Lie/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Le1/c;->a:Landroid/text/Spannable;

    .line 5
    .line 6
    iput-object p2, p0, Le1/c;->b:Lie/p;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Le1/c;->a:Landroid/text/Spannable;

    .line 2
    .line 3
    iget-object v1, p0, Le1/c;->b:Lie/p;

    .line 4
    .line 5
    check-cast p1, LU0/I0;

    .line 6
    .line 7
    check-cast p2, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    check-cast p3, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    invoke-static {v0, v1, p1, p2, p3}, Le1/d;->a(Landroid/text/Spannable;Lie/p;LU0/I0;II)LTd/L;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
.end method
